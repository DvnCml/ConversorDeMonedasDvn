import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

import com.google.gson.Gson;  // importamos Gson

public class Conversor {
        private static final String API_KEY = "994f0eebeec3881809f44efa"; // Clave API
        private static final String API_URL = "https://v6.exchangerate-api.com/v6/%s/pair/%s/%s"; //URL API

    //usamos final para convertir la variable en constante
        private final HttpClient client;
        private final Gson gson;

    public Conversor() {
            client = HttpClient.newHttpClient();
            gson = new Gson();
        }
                                        //variables solicitadas                     //excepcionesJAVA
        public double obtenerTasaCambio(String monedaBase, String monedaObjetivo) throws IOException, InterruptedException {
            String url = String.format(API_URL, API_KEY, monedaBase.toUpperCase(), monedaObjetivo.toUpperCase()); //usamos to upercase para evitar que la Api nos de una respuesta de excepcion o error

            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(url))
                    .GET()
                    .build();

            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

            if (response.statusCode() == 200) {
                ExchangeRateResponse rateResponse = gson.fromJson(response.body(), ExchangeRateResponse.class);

                if ("success".equalsIgnoreCase(rateResponse.getResult())) {
                    return rateResponse.getConversionRate();
                } else {
                    throw new RuntimeException("Error en la respuesta de la API: " + rateResponse.getResult());
                }
            } else {
                throw new RuntimeException("Error HTTP: " + response.statusCode());
            }
    }
}
