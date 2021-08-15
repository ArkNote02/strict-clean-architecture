package com.github.jiantailang.book.adapters.kafka;

import com.github.jiantailang.book.Book;
import com.github.jiantailang.book.Event;
import com.github.jiantailang.book.adapters.kafka.models.KafkaBookEvent;
import com.github.jiantailang.book.ports.BookEventPublisher;
import lombok.RequiredArgsConstructor;
import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Primary;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

@RequiredArgsConstructor
@Component
@Primary
public class KafkaBookAdapter implements BookEventPublisher {

    private final NewTopic bookEventTopic;
    private final KafkaTemplate<String, KafkaBookEvent> kafkaTemplate;

    @Override
    public void publish(Event event, Book book) {
        kafkaTemplate.send(bookEventTopic.name(), KafkaBookEvent.of(event, book));
    }
}
