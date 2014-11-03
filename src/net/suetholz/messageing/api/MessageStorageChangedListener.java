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
    public void newMessageProduced (MessageType message);
    public void oldMessageRemoved (MessageType message);
}
