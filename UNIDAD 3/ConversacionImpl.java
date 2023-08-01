package com.app.sockets.dao;

import com.app.sockets.conexion.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Timestamp;

public class ConversacionImpl implements ConversacionDAO {

    Conexion instanciaMySQL = Conexion.getInstance();

    @Override
    public void registrarConversacionA(String mensaje) {
        registrarMensaje(mensaje, null);
    }

    @Override
    public void registrarConversacionB(String mensaje) {
        registrarMensaje(null, mensaje);
    }

    private void registrarMensaje(String mensaje, String servidor) {
        PreparedStatement consulta = null;
        Connection conexion = null;

        try {
            conexion = instanciaMySQL.conectar();
            consulta = conexion.prepareStatement("INSERT INTO messages (CLIENT, SERVER, DATE) VALUES (?, ?, ?)");

            consulta.setString(1, mensaje);
            consulta.setString(2, servidor);

            // Obtener la fecha y hora actual para la columna "DATE"
            Timestamp fechaActual = new Timestamp(System.currentTimeMillis());
            consulta.setTimestamp(3, fechaActual);

            consulta.executeUpdate();
        } catch (SQLException error) {
            System.out.println(error);
        } finally {
            // Cerrar recursos (consulta y conexión)
            try {
                if (consulta != null) {
                    consulta.close();
                }
                if (conexion != null) {
                    conexion.close();
                }
            } catch (SQLException e) {
                System.out.println("Error al cerrar recursos: " + e);
            }
        }
    }
}
