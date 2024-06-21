import com.google.gson.Gson;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsultarValorCambio {

    String serverAPI = "https://v6.exchangerate-api.com/v6/";
    String apiKey = "97e7b994d5ad587f2e29ab61";

    public Conversor buscarCotizacion(String monedaOrigen, String monedaDestino,
                                      double monto){
        URI direccion = URI.create(serverAPI + apiKey + "/pair/" + monedaOrigen+"/"+
                monedaDestino + "/" + monto);
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(direccion)
                .build();

        try {
            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
            return new Gson().fromJson(response.body(), Conversor.class);
        } catch (Exception e) {
            throw new RuntimeException("No se logró obtener la cotización. " + e.getMessage());
        }
    }
}
