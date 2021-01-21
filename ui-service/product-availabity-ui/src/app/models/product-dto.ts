import { LocationDto } from './location-dto';

export interface ProductDTO {
    productId: Number;
    name: String;
    locations: LocationDto[];
    imageUrl: String;
    description: String;
}
