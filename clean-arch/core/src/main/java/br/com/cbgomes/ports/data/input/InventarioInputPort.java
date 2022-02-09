package br.com.cbgomes.ports.data.input;

import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class InventarioInputPort {

    private List<ItemInputPort> itens;
}
