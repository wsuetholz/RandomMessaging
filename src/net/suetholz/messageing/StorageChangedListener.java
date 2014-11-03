/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.suetholz.messageing;

import net.suetholz.messageing.api.MessageStorageChangedListener;
import net.suetholz.messageing.api.MessageStorage;
import net.suetholz.messageing.api.MessageType;

/**
 *
 * @author wsuetholz
 */
public class StorageChangedListener implements MessageStorageChangedListener {

    private static final String MESSAGE_IS_NULL = "Message parameter invalid!";
    private static final String STORAGE_IS_NULL = "Message parameter invalid!";
    private MessageStorage storage;

    public StorageChangedListener(MessageStorage storage) {
	if (storage == null) {
	    throw new IllegalArgumentException(STORAGE_IS_NULL);
	}

	this.storage = storage;
    }

    @Override
    public void newMessageProduced(MessageType message) {
	if (message == null) {
	    throw new IllegalArgumentException(MESSAGE_IS_NULL);
	}
	storage.addMessage(message);
    }

    @Override
    public void oldMessageRemoved(MessageType message) {
	if (message == null) {
	    throw new IllegalArgumentException(MESSAGE_IS_NULL);
	}
	storage.removeMessage(message);
    }

}
