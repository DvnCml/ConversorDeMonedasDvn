# 🪙 Conversor de Monedas en Java

Ejercicio conversor d monedas alura G8

Una aplicación de consola desarrollada en **Java 17** que permite convertir montos entre distintas monedas usando la API de [ExchangeRate API](https://www.exchangerate-api.com/). Utiliza **Gson** para el procesamiento de datos en formato JSON.

---

## 🚀 Características

- Conversión rápida entre monedas.
- 7 opciones predeterminadas de cambio:
  - COP ➝ USD
  - MXN ➝ USD
  - USD ➝ CAD
  - USD ➝ EUR
  - EUR ➝ JPY
  - GBP ➝ USD
  - Opción manual: elige cualquier par de monedas.
- Entrada de monto para calcular el total convertido.
- Uso de la API REST de ExchangeRate con JSON.
- Basado en consola, sin dependencias pesadas.

---

## 🧰 Tecnologías utilizadas

- Java 17
- Gson (Google)
- ExchangeRate API (v6)

---

## 📦 Requisitos

- JDK 17 instalado
- Conexión a Internet
- Tu propia [API key gratuita de ExchangeRate](https://www.exchangerate-api.com/) //en este caso se usa mi apiKey

---

## ⚙️ Instalación

1. Clona el repositorio
2.📷 Captura de Consola

****************************************************
=== Conversor de Moneda ===
Seleccione una opción:
1. COP a USD (Peso Colombiano a Dollar Americano)
2. MXN a USD (Peso Mexicano a Dollar Americano)
3. GBP a USD (Libra esternina a Dolar Americano)
4. USD a CAD (Dollar Americano a Dollar Canadience)
5. USD a EUR (Dollar Americano a Euro)
6. EUR a JPY (Euro a Yen Japones)
7. Elegir moneda base y objetivo (seleccione segun sea el incicativo de moneda de origen u moneda de destino.)
Opción: 4
Ingresa el monto en USD: 100
Tasa actual: 1 USD = 1,3953 CAD
Monto convertido: 100,00 USD = 139,53 CAD
****************************************************
3.✅ To-do futuro
 - Permitir múltiples conversiones en una sola ejecución.
 - Mostrar la fecha y hora de actualización del tipo de cambio.
 - Guardar historial de conversiones en un archivo.
 - Empaquetar como .jar ejecutable.
