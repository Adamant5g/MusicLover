fun main() {
    val buyer = true
    val purchaseAmount = 1001
    val discount100 = 100
    val discount5 =  0.05
    val discount1 = 0.01
    val finalPrice = if (buyer) {
        if (purchaseAmount in 1001..10000) {
            (purchaseAmount - discount100) * (1-discount1)
        } else if (purchaseAmount > 10000) {
            (purchaseAmount - discount100) * (1-discount5) * (1-discount1)
        } else {
            purchaseAmount
        }
    } else {
        if (purchaseAmount in 1001..10000) {
            purchaseAmount - discount100
        } else if (purchaseAmount > 10000) {
            (purchaseAmount - discount100) * (1-discount5)
        } else {
            purchaseAmount
        }
    }

    println("Итоговая стоимость товара: $purchaseAmount, с учетом скидок: $finalPrice")
}