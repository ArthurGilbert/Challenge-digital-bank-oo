package Gilbert.Arthur.Client;

import java.util.HashMap;
import java.util.Map;

public class ClientManager {

    private static ClientManager instance = new ClientManager();
    private static Map<String, Client> clientsByCpf = new HashMap<>();

    private ClientManager() {
        // Private builder to avoid direct instantiation
    }

    public static ClientManager getInstance() {
        return instance;
    }

    public void registerClient(Client client) {
        if (!clientsByCpf.containsKey(client.getCpf())) {
            clientsByCpf.put(client.getCpf(), client);
            System.out.println("Client registered successfully.");
        } else {
            System.out.println("CPF already registered.");
        }
    }

    // Method to get a customer by cpf
    public Client getClientByCpf(String cpf) {
        return clientsByCpf.get(cpf);
    }

    public static String getClientsInfo() {
        StringBuilder clientsInfo = new StringBuilder("*** List of Clients ***\n");

        for (Client client : clientsByCpf.values()) {
            clientsInfo.append("Client Name: ").append(client.getName()).append("\n");
            clientsInfo.append("Client CPF: ").append(client.getCpf()).append("\n");
            clientsInfo.append("-----------------------------\n");
        }

        return clientsInfo.toString();
    }

}
