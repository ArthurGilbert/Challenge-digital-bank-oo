package Gilbert.Arthur.Client;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Client {

    private String name;
    private String cpf;

    public Client(String name, String cpf) {
        this.name = name;
        this.cpf = cpf;
        ClientManager.getInstance().registerClient(this);
    }
}
