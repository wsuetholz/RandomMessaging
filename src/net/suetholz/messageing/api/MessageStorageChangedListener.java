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
public interface MessageStorageChangedListener {
    public abstract void newMessageProduced (MessageType message);
    public abstract void oldMessageRemoved (MessageType message);
}
