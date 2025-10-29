package app;

import java.util.Scanner;

public class Main {
    // Scanner global para leer datos del usuario
    private static Scanner scanner = new Scanner(System.in);
    // Gestor que maneja todas las tareas

    private static GestorTareas gestor = new GestorTareas();
    public static void main(String[] args) {
// Mengisaje de bienvenida
        System.out.println("╔══════════════════════════════════════╗");
        System.out.println("║ GESTOR DE TAREAS SIMPLE v1.0 ║");
        System.out.println("╚══════════════════════════════════════╝\n");
// Cargar tareas guardadas previamente
        gestor.cargarDesdeArchivo();
        boolean salir = false;
// Ciclo principal del programa
        while (!salir) {
            mostrarMenu();
            int opcion = leerOpcion();
            switch (opcion) {
                case 1:
// TODO: Implementar por Miembro 1
                    System.out.println("\n🔨 Funcionalidad 'Agregar tarea' en desarrollo...");
                    break;
                case 2:
// TODO: Implementar por Miembro 2
                    System.out.println("\n🔨 Funcionalidad 'Listar tareas' en desarrollo...");
                    break;
                case 3:




