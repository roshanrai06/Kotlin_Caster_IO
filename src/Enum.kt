fun main(args: Array<String>) {
    val value = AccountType.valueOf("Platinum".toUpperCase())
    println(value)
    println(value.discountPercent)
    println(value.numberOfSubscription)
    val valueWithAbstract = AccountTypeWithAbstractFun.valueOf("gold".toUpperCase())
    println(valueWithAbstract)
    println(valueWithAbstract.calculateDiscountPercentage())

}

enum class AccountType(val discountPercent: Int, val numberOfSubscription: Int) {
    BRONZE(10, 1),
    SILVER(15, 5),
    GOLD(20, 10),
    PLATINUM(25, 20)
}

enum class AccountTypeWithAbstractFun() {
    BRONZE {
        override fun calculateDiscountPercentage(): Int {
            return 5
        }
    },
    SILVER {
        override fun calculateDiscountPercentage(): Int {
            return 10

        }
    },
    GOLD {
        override fun calculateDiscountPercentage(): Int {
            return 15

        }
    },
    PLATINUM {
        override fun calculateDiscountPercentage(): Int {
            return 20

        }
    };

    abstract fun calculateDiscountPercentage(): Int
}