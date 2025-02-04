# pruebaasd
prueba tecnica ASD kotlin usando JetPack compose 

patron MVVM, 
navigation compose, 
dagger-hilt,
retrot2,
coil,
timber,
pallete,
coroutines kotlin

## Archivo de prueba

### Requisitos:

1.  **Y Pantalla Principal:**
Mostrar una lista de elementos obtenidos desde una API pública (por
ejemplo, JSONPlaceholder).

R:// se desarollo con la url de poke api 
https://pokeapi.co/api/v2/pokemon/

2. **Los datos deben incluir título y descripción.**
Implementar una búsqueda para filtrar elementos por título.

R:// el pakage PokemonList contiene la vista y elviewmodel de esta solicitud

3. **Pantalla de Detalle:**
Al seleccionar un elemento de la lista, abrir una nueva pantalla que muestre
más detalles del elemento (por ejemplo, el cuerpo del post).

R:// el pakage PokemonDetail contiene la vista y elviewmodel de el detalle

4. **de Integración de SDK externo:**
Utilizar una biblioteca de terceros (Por ejemplo: para mostrar imágenes como
Glide).

Cada elemento debe incluir una imagen fija obtenida desde un enlace (por
ejemplo, imágenes de Unsplash).

R:// se uso para la carga de imagnes coil 
    implementation(libs.coil)
    implementation(libs.accompanist.coil)

las imagenes se obtienen de la siguiente url fija
https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/

**Requisitos Técnicos:**

● Usar Kotlin y el patrón MVVM.  
R:// se usa en el proyecto mas clean arquitecture 

● Utilizar Retrofit para el consumo de APIs REST.
R:// usado retorift 2 revisar el build.gradle 

● Implementar navegación con Jetpack Navigation Component.
R://usado revisar el build.gradle

● Usar ViewModel y LiveData.
● Crear un archivo README con instrucciones para correr el proyecto y explicación de
las decisiones tomadas.

tambien se uso dagger-hit para el manejo de injeccion de dependencias

    

