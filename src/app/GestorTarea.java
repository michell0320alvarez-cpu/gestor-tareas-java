package app;

import java.time.LocalDate;

public class GestorTarea {


    public class Tarea {

        // Atributos
        private String descripcion;
        private LocalDate fecha;
        private boolean completada;

        public Tarea(String descripcion, LocalDate fecha, boolean completada) {
            this.descripcion = descripcion;
            this.fecha = fecha;
            this.completada = completada;
        }

        {
            this.descripcion = descripcion;
            this.fecha = fecha;
            this.completada = false; // Por defecto, no está completada
        }


        public String getDescripcion () {
            return descripcion;
        }

        public LocalDate getFecha () {
            return fecha;
        }

        public boolean isCompletada () {
            return completada;
        }
        // Método para modificar el estado (setter)
        public void setCompletada(boolean completada) {
            this.completada = completada;
        }
        /**
         * Convierte la tarea a texto legible.
         */
        @Override
        public String toString() {
            String estado = completada ? "✓ Completada" : "○ Pendiente";
            return descripcion + " | Fecha: " + fecha + " | Estado: " + estado;
        }
    }
}
