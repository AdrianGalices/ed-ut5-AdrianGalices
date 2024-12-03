public class ejemplo1{
    public static void main(String[] args) {
        String texto = "Texto de Prueba";
        //El primer metodo nos muestra cuantos carateres o como de largo es el 'Texto de Prueba'
        //Podemos observar por consola la longitud de la variable texto
        System.out.println("Longitud de" + texto + "es" + texto.length());

        //En este metodo podemos ver donde se encuentra un caracter dentro de nuestro texto
        //Nos mostrara por consola en que posicion se encuentra el caracter numero 11
        System.out.println("Carácter en la posición 11:" + texto.charAt(11));

        //En el siguiente metodo podemos ver como extraemos los caracteres que se encuentran en la posicion descrita
        //Como hemos mencionado en el ejercicio, la subcadena representara la palabra Prueba que se encuentra entre el caracter 10 y el numero 15
        System.out.println("Subcadena (9,15): " + texto.substring(9, 15));

        //Este metodo nos ayuda a cambiar todo el texto a mayusculas
        //Observamos como a partir de la instruccion obtenemos este cambio
        System.out.println("En mayúsculas:" + texto.toUpperCase());

        //En este metodo concretamos para obtener todo lo contrario al metodo anterior
        //A raiz de esta instruccion damos lugar a todo el texto en minuscula
        System.out.println("En minúsculas: " + texto.toLowerCase());

        //Este metodo nos muestra la diferencia entre ambos textos
        //Partimos de la base de que la principal diferencia son las letras mayusculas y minusculas
        String TextoNumeroDos = "texto de prueba";
        System.out.println("¿Son iguales 'Texto de Prueba' y 'texto de prueba'? " + texto.equals(TextoNumeroDos));

        //Al igual que en el metodo anterior comparabamos, aqui se realiza una comprobacion parecida
        //El texto se comprueba ignorando este cambio ya producido
        //Devolvera una respuesta verdadera o falsa, en este caso sera verdadera (true)
        System.out.println("¿Son iguales ignorando mayúsculas? " + texto.equalsIgnoreCase(TextoNumeroDos));

        //Este metodo nos muestra donde comienza una palabra
        //Al seleccionar la palabra Prueba, el metodo nos devuelve donde comienza dicha palabra
        System.out.println("Posicion de Prueba:" + texto.indexOf("Prueba"));

        //Este metodo reemplaza ciertos caracteres por otros
        //Todos aquellos caracteres que empiecen por 'o' seran reeemplazados por una 'x'
        System.out.println("Reemplazar 'o' con 'x': " + texto.replace('o', 'x'));

        //Este metodo elimina espacios que se encuentran al principio de la frase y al final de la misma
        //Podemos observar como por consola imprimimos solo las palabras sin sus previos espacios y sin los espacios que contenia al final
        String textoConEspacios = "  Texto de Prueba ";
        System.out.println("Después de trim(): '" + textoConEspacios.trim() + "'");
    }
}