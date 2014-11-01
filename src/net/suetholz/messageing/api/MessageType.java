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
public interface MessageType {
    /**
     * Must have a way to convert to a String
     * 
     * @return
     */
    @Override
    public abstract String toString();
}
