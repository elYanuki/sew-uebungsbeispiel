import {inject, Injectable} from '@angular/core';
import {HttpClient} from "@angular/common/http"

@Injectable({
  providedIn: 'root'
})
export class ShopService {
  constructor() { }

  http = inject(HttpClient)

  createOrder(productIds: number[]) {
    return this.http.post('http://localhost:8080/shop/createOrder', productIds)
  }
}
