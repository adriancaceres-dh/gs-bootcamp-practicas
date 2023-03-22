# S1_G4
Repositorio para el sprint 1, bootcamp de Java

Link para todos los hoteles:
http://localhost:8080/api/v1/hotels

Links para testear filtro:
http://localhost:8080/api/v1/hotel?dateFrom=11/02/2022&dateTo=10/03/2022&destination=Puerto Iguazú

http://localhost:8080/api/v1/hotel?dateFrom=11/02/2022&dateTo=10/03/2022&destination=Buenos Aires

http://localhost:8080/api/v1/hotel?dateFrom=11/02/2022&dateTo=10/03/2022&destination=Bogotá

Link para la reserva de hotel:
http://localhost:8080/api/v1/booking

JSON:
{
    "userName" : "luchofesta@gmail.com",
    "booking" : {
        "dateFrom" : "2022-02-12",
        "datoTo" : "2022-03-20",
        "destination" : "Buenos Aires",
        "hotelCode" : "BH-0002",
        "peopleAmount" : 2,
        "roomType" : "Double",
        "people" : [
            {
                "dni" : "36365939",
                "name" : "Luciano",
                "lastName" : "Festa",
                "birthDate" : "1992-01-24",
                "email" : "luchofesta@gmail.com"
            },
            {
                "dni" : "38884160",
                "name" : "Sofia",
                "lastName" : "Ramos Dietmair",
                "birthDate" : "1995-07-12",
                "email" : "sofiramos@gmail.com"
            }
        ],
        "paymentMethod" : {
            "type" : "CreditCard",
            "number" : "4545 8585 9696 6565",
            "dues" : 6
        }
    }
}

Link para todos los vuelos:
http://localhost:8080/api/v1/flights

Links para testear filtro:
http://localhost:8080/api/v1/flight?dateFrom=09/02/2022&dateTo=15/02/2022&origin=Buenos Aires&destination=Puerto Iguazú

Link para la reserva del vuelo:
http://localhost:8080/api/v1/flight-reservation

JSON:
{
    "userName" : "luchofesta@gmail.com",
    "flightReservation" : {
        "dateFrom" : "2022-02-10",
        "datoTo" : "2022-02-15",
        "origin" : "Buenos Aires",
        "destination" : "Puerto Iguazú",
        "flightNumber" : "PIBA-1420",
        "seats" : 2,
        "seatType" : "BUSINESS",
        "people" : [
            {
                "dni" : "36365939",
                "name" : "Luciano",
                "lastName" : "Festa",
                "birthDate" : "1992-01-24",
                "email" : "luchofesta@gmail.com"
            },
            {
                "dni" : "38884160",
                "name" : "Sofia",
                "lastName" : "Ramos Dietmair",
                "birthDate" : "1995-07-12",
                "email" : "sofiramos@gmail.com"
            }
        ],
        "paymentMethod" : {
            "type" : "CreditCard",
            "number" : "4545 8585 9696 6565",
            "dues" : 6
        }
    }
}


