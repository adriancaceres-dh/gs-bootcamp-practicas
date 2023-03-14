# S1_G3
- En la UserStory 3 vamos a mostrar el precio de la reserva ya que creemos que es el dato mas relevante.
- Asumimos que la cantidad de personas que reservan las habitaciones es coincidente con el tipo de habitación solicitada. Por ejemplo, si una persona reserva una habitacion doble, entendemos que está acompañado.

# Endpoints POSTMAN
- User Story 1= localhost:8085/api/v1/hotels

- User Story 2= localhost:8085/api/v1/hotel?dateFrom=11/02/2022&dateTo=10/03/2022&destination=Puerto Iguazú

- User Story 3= localhost:8085/api/v1/booking
  - Para ver los resultados, ingresar:
    - {     "username": "Stefano",     "booking": {         "dateFrom": "25-01-2023",         "dateTo": "01-02-2023",         "destination": "Gral. Pico",         "hotelCode": "HB-0001",         "peopleAmount": 3,         "roomType": "Double",         "people": [             {                 "dni": 999999999,                 "name": "Robertito",                 "lastname": "Mmmm",                 "birthday": "03-02-2023",                 "mail": "roertito.mmmm@ok.com"             }         ],         "payments": {             "type": "tarjeta de credito",             "number": "1234-1234-1234-1234",             "dues": 99         }     } }

- User Story 4= localhost:8085/api/v1/flights

- User Story 5= localhost:8085/api/v1/flight?dateFrom=10/02/2022&dateTo=15/02/2022&origin=Buenos Aires&destination=Puerto Iguazú

- User Story 6= localhost:8085/api/v1/flight-reservation