package ru.avalon.java.udp;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.SocketAddress;
import java.net.UnknownHostException;

/**
 * Упражнение, направленное на выработку умений, связанных с отправкой сообщений
 * средствами протокола UDP.
 *
 * @author Daniel Alpatov
 */
public final class UdpSender {

    public static void main(String[] args) throws IOException {
        // 1. Формируем сообщение
        final String message = prepareMessage();
        // 2. Формируем адрес конечной точки.
        final SocketAddress address = prepareAddress();
        // 3. Формируем датаграмму.
        final DatagramPacket packet = pack(message);
        // 4. Устанавливаем адрес для пакета.
        packet.setSocketAddress(address);
        // 5. Создаём сокет
        DatagramSocket socket = createSocket();
        // 6. Отправляем сообщение
        socket.send(packet);
        // 7. Освобождаем ресурсы
        socket.close();
        
        System.out.println("message sent");
    }

    /**
     * Возвращает сообщение.
     *
     * @return текстовое сообщение.
     */
    private static String prepareMessage() {

        String message = "Privet UDP!";
        return message;
        /*
         * TODO Реализовать метод prepareMessage класса UdpSender
         */
        //throw new UnsupportedOperationException("Not implemented yet!");
    }

    /**
     * Возвращает адрес конечной точки взаимодействия.
     *
     * @return адрес конечной точки.
     */
    private static SocketAddress prepareAddress() throws UnknownHostException {
        
        InetAddress address = InetAddress.getLocalHost();
        
        InetSocketAddress socketAddress = new InetSocketAddress(address, 9999);
        
        return socketAddress;
       
        /*
         * TODO Реализовать метод prepareAddress класса UdpSender
         */
        //throw new UnsupportedOperationException("Not implemented yet!");
    }

    /**
     * Возвращает сокет, описывающий взаимодействие по протоколу UDP.
     *
     * @return сокет.
     * @throws IOException
     */
    private static DatagramSocket createSocket() throws IOException {

        DatagramSocket socket = new DatagramSocket();
        return socket;
        /*
         * TODO Реализовать метод createSocket класса UdpSender
         */
        //throw new UnsupportedOperationException("Not implemented yet!");
    }

    /**
     * Упаковывает текстовое сообщение в объект типа {@link DatagramPacket}.
     *
     * @param message строковое сообщение.
     *
     * @return экземпляр типа {@link DatagramPacket}.
     */
    private static DatagramPacket pack(String message) throws UnsupportedEncodingException {

        byte[] datagram = message.getBytes("UTF-8");
        DatagramPacket packet = new DatagramPacket(datagram, datagram.length);        
        return packet;
        /*
         * TODO Реализовать метод pack класса UdpSender
         */
        //throw new UnsupportedOperationException("Not implemented yet!");
    }

}
