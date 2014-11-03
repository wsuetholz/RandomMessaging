/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.suetholz.messageing.api;

/**
 *
 * @author wsuetholz
 */
public interface MessageStorage {
    /**
     * Add a Message to the messageList
     *
     * @param message
     */
    public abstract void addMessage(MessageType message);

    public abstract void removeMessage(MessageType message);

    public abstract MessageType getMessage (int idx);

}
