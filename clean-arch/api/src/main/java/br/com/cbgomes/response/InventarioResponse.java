package br.com.cbgomes.response;

import br.com.cbgomes.request.ItemRequest;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class InventarioResponse {

    private Long id;

    private Integer pontosDoInventario;

    private List<ItemRequest> itens;
}
