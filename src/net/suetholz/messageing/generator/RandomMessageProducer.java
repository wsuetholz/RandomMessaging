package net.suetholz.messageing.generator;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Objects;
import java.util.Random;
import net.suetholz.messageing.api.MessageProducer;
import net.suetholz.messageing.api.MessageStorage;
import net.suetholz.messageing.api.MessageType;

/**
 *
 * @author wsuetholz
 */
public class RandomMessageProducer implements MessageProducer {

    private static final String MESSAGE_IS_NULL = "Message parameter invalid!";

    MessageStorage messageStorage;
    
    public RandomMessageProducer(MessageStorage messageStorage) {
	if (messageStorage == null) {
	    throw new IllegalArgumentException();
	}
	this.messageStorage = messageStorage;
    }

    @Override
    public final MessageType produceMessage() {
	Random r = new Random(System.nanoTime());
	int index = r.nextInt(messageStorage.length());

	return (messageStorage.getMessage(index));
    }

    @Override
    public final int hashCode() {
	int hash = 7;
	hash = 17 * hash + Objects.hashCode(this.messageStorage);
	return hash;
    }

    @Override
    public final boolean equals(Object obj) {
	if (obj == null) {
	    return false;
	}
	if (getClass() != obj.getClass()) {
	    return false;
	}
	final RandomMessageProducer other = (RandomMessageProducer) obj;
	if (!Objects.equals(this.messageStorage, other.messageStorage)) {
	    return false;
	}
	return true;
    }

    @Override
    public final String toString() {
	return "RandomMessageProducer{" + "messageList=" + messageStorage.toString() + '}';
    }

}
