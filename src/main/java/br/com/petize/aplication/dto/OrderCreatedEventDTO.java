package br.com.petize.aplication.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class OrderCreatedEventDTO  implements Serializable {
    private static final long serialVersionUID = 1L;
    private Long id;
    private String value ;

}
