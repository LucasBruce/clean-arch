package br.com.cbgomes.response;

import br.com.cbgomes.ports.data.output.ItemOutputPort;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ItemResponse {

    private Long id;

    private int quantidade;

    private Integer pontosDoItem;

    private String tipoItem;

    public static List<ItemResponse> convertItemOutputPortToResponse(List<ItemOutputPort> itens){
        List<ItemResponse> itemReponseList = new ArrayList<>();

        itens.forEach(itemOutputPort -> {
            ItemResponse item = ItemResponse.builder()
                    .id(itemOutputPort.getId())
                    .quantidade(itemOutputPort.getQuantidade())
                    .tipoItem(itemOutputPort.getTipoItem())
                    .pontosDoItem(itemOutputPort.getPontosDoItem())
                    .build();
            itemReponseList.add(item);
        });
        return itemReponseList;
    }
}
