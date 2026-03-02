## Sección 1) Habilidades básicas de programación

###### Encriptación y manejo de cadenas

El objetivo de esta sección es **evaluar tus habilidades básicas de programación**.

Todo mundo conoce contraseñas. Uno puede escoger contraseñas de poemas, canciones, películas, películas, etc. Pero estas frecuentemente pueden ser adivinadas por referencias culturales comunes. Puede hacer tu contraseñas mas sólidas de diferentes maneras, una de ellas es la siguiente.

Escoge un texto en letras mayúsculas que incluya o no dígitos o no caracteres numéricos.

1. Mueve cada letra por un determinado numero de veces pero la letra debe de seguir siendo una letra (circular shift) Ej. $A + 2 = C$, $Z+1 = A$
2. Reemplaza cada digito por su complemento a 9.
3. Mantén los caracteres no alfabéticos y que no son digitos
4. Haz letra minúscula cada letra en una posición impar y mayúscula cada letra en una posición par (the first character is in position 0),
5. Invierte todo el resultado.

**Ejemplo**:

Tu texto: "BORN IN 2015!", shift 1 y complemento a 9 -> "CPSO JO 7984!"

En paso 4: "CpSo jO 7984!"

En paso 5: "!4897 Oj oSpC"