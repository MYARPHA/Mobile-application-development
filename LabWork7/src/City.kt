class City(_name: String)
    {
        var name: String =_name
            set(value){
                if(value.isNotEmpty())
                {
                    field = value
                }
                else
                {
                    println("Ошибка! Поле не может быть пустым!")
                }
            }
        var country: String = ""
            set(value) {
                if (value.isNotEmpty())
                {
                    field = value
                }
                else
                {
                    println("Ошибка! Поле не может быть пустым!")
                }
            }
        var area: Double = 0.0
            set(value) {
                if(value >= 0)
                {
                    field = value
                }
                else
                {
                    println("Ошибка! Площадь не может быть отрицательной!")
                }
            }
        var population: Int = 0
            set(value) {
                if(value >= 0)
                {
                    field = value
                }
                else
                {
                    println("Ошибка! Численность населения не может быть отрицательным!")
                }
            }

        init {
            name = _name
        }

        constructor(_name: String, _country: String, _area: Double, _population: Int): this(_name)
        {
            country = _country
            area = _area
            population = _population
        }


        // Task 3
        open fun printInfo(){
            println("Город: $name, Страна: $country, Площадь: $area км^2, Население: $population чел")
        }

        val lastParamComment: String
            get() = "Численность населения: $population человек"

        // Task 1
        override fun toString(): String {
            return "Город: $name, Страна: $country, Площадь: $area км^2, Население: $population чел"
        }
    }