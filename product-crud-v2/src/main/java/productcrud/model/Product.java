package productcrud.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import lombok.*;

@Document
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Builder
public class Product {
    @Id
    private Long id;
    private Long productId;
    private String name;
    private Long locationId;
    private int quantity;
    private String imageUrl;
    private String description;
}
