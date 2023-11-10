package soap;

import soap.ServicoCalculadora;
import javax.xml.ws.Endpoint;

public class PublicadorCalculadora {
    public static void main(String args[]){
        Endpoint.publish(
            "http://127.0.0.1:9876/calcsoap", 
            new ServicoCalculadora()
        );
        System.out.println("Servico Calculadora em execucao...");
    }
}
