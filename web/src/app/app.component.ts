import {Component, inject} from '@angular/core';
import { RouterOutlet } from '@angular/router';
import {FormsModule} from "@angular/forms"
import {NgForOf} from "@angular/common"
import {ShopService} from "./shop.service"

@Component({
  selector: 'app-root',
  standalone: true,
  imports: [RouterOutlet, FormsModule, NgForOf],
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})
export class AppComponent {
  productIds: number[] = []
  currentProductId: number = 0
  shopService = inject(ShopService)

  addProductId(): void {
    this.productIds.push(this.currentProductId)
    this.currentProductId = 0
    console.log(this.productIds)
  }

  createOrder(): void {
    this.shopService.createOrder(this.productIds).subscribe((response) => {
      if(response) this.productIds = []
    })
  }
}
