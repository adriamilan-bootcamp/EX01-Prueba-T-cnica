# EX01-Prueba-Tecnica

## URIs endpoints: 
```
Login
POST      /login   
curl -i -H "Content-Type: application/json" -X POST -d '{ "username": "admin", "password": "password"}' https://prueba-tecnica-lfg.herokuapp.com/login

Grupo
GET       /api/grupos
GET       /api/grupos/{id}
GET       /api/grupos/{nombre}
POST      /api/grupo
curl -i -H 'Content-Type: application/json' -H 'Authorization: Bearer xxx.yyy.zzz' -X POST -d '{ "nombre": "nombre", "videojuego": "videojuego"}' https://prueba-tecnica-lfg.herokuapp.com/api/grupo/
PUT       /api/grupo/{id}
DELETE    /api/grupo/{id}

Uniones Grupos <- -> Usuarios
GET       /api/uniones
GET       /api/grupos/{usuario}
GET       /api/grupos/{grupo}
POST      /api/unir/grupo
curl -i -H 'Content-Type: application/json' -H 'Authorization: Bearer xxx.yyy.zzz' -X POST -d '{ "usuario": id_usuario, "grupo": { "id": id_grupo, "nombre": "nombre", "videojuego": "videojuego" }}' https://prueba-tecnica-lfg.herokuapp.com/api/unir/grupo
DELETE    /api/salir/grupo/{id}

Mensaje
GET       /api/mensajes
GET       /api/mensajes/{id}
GET       /api/mensajes/{usuario}
GET       /api/mensajes/{grupo}
POST      /api/mensajes
curl -i -H 'Content-Type: application/json' -H 'Authorization: Bearer xxx.yyy.zzz' -X POST -d '{ "mensaje" : "mensaje", "usuario": usuario, "grupo": grupo}' https://prueba-tecnica-lfg.herokuapp.com/api/mensajes
PUT       /api/mensajes/{id}
DELETE    /api/mensajes/{id}
```
![image](https://user-images.githubusercontent.com/108835310/185810872-97bbfbf9-3609-4480-b4ea-aad1f2d6a2f1.png)
