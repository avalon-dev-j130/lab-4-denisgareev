package ru.avalon.java.udp;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Упражнение, на правленное на выработку умений, связанных с полученеим
 * сообщений, отправленных с использование протокола UDP.
 *
 * @author Daniel Alpatov
 */
public final class UdpReceiver {

    public static void main(String[] args) throws IOException {
        // 1. Формиоуем буффер, для хранения получаемых данных.
        final byte[] buffer = prepareBuffer();
        // 2. Формируем пакет, на основе созданного буфера.
        final DatagramPacket packet = preparePacket(buffer);
        // 3. Выбираем порт, на который ожидается получение сообщения.
        final int port = 0;
        // 4. Формируем сокет, связанный с выбранным портом.
        final DatagramSocket socket = prepareSocket(port);
        // 5. Получаем сообщение.
        socket.receive(packet);
        // 6. На основании данных пакета формируем текстовое сообщение.
        final String message = getMessage(packet);
        // 7. Освобождаем ресурсы.
        socket.close();
    }

    /**
     * Возвращает буффер, который будет испопльзован для храрнения получаемых данных.
     *
     * @return двоичный массив.
     */
    private static byte[] prepareBuffer() {
        
        final int MAX_MESSAGE_SIZE = 1024;
        byte[] buffer = new byte[MAX_MESSAGE_SIZE];
        return buffer;
        /*
         * TODO Реализовать метод prepareBuffer класса UdpReceiver
         */
        //throw new UnsupportedOperationException("Not implemented yet!");
    }

    /**
     * Упаковывает переданный двоичный массив (буффер) в экземпляр
     * типа {@link DatagramPacket}.
     *
     * @param buffer буффек, который будет использован пакетом для
     *               хранения получаемых данных.
     *
     * @return экземпляр типа {@link DatagramPacket}.
     */
    private static DatagramPacket preparePacket(byte[] buffer) {
        
        DatagramPacket packet = new DatagramPacket(buffer, buffer.length);
        return packet;
        /*
         * TODO Реализовать метод preparePacket класса UdpReceiver
         */
        //throw new UnsupportedOperationException("Not implemented yet!");
    }

    /**
     * Возвращает сокет, связанный с указанным портом.
     *
     * @param port порт.
     *
     * @return сокет.
     */
    private static DatagramSocket prepareSocket(int port) throws SocketException {
        
        DatagramSocket socket = new DatagramSocket(9999);
        return socket;
        /*
         * TODO Реализовать метод prepareSocket класса UdpReceiver
         */
        //throw new UnsupportedOperationException("Not implemented yet!");
    }

    /**
     * Преобразует данные, содержащиеся в полученном пакете в текстовое
     * представление.
     *
     * @param packet пакет.
     *
     * @return строковое сообщение.
     */
    private static String getMessage(DatagramPacket packet) {
        
        String message = "";
        try {
            message = new String(packet.getData(), "UTF-8");
        } catch (UnsupportedEncodingException ex) {
            Logger.getLogger(UdpReceiver.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println(message);
        return message;
        /*
         * TODO Реализовать метод getMessage класса UdpReceiver
         */
        //throw new UnsupportedOperationException("Not implemented yet!");
    }

}
