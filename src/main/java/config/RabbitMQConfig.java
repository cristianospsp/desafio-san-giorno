package config;

import org.springframework.amqp.core.Queue;
import org.springframework.amqp.rabbit.connection.CachingConnectionFactory;
import org.springframework.amqp.rabbit.connection.ConnectionFactory;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RabbitMQConfig {

    public static final String FILA_PARCIAL = "pagamento_parcial";
    public static final String FILA_TOTAL = "pagamento_total";
    public static final String FILA_EXCEDENTE = "pagamento_excedente";

    /**
     * Configuração da conexão com o RabbitMQ.
     */
    @Bean
    public ConnectionFactory connectionFactory() {
        CachingConnectionFactory connectionFactory = new CachingConnectionFactory("localhost");
        connectionFactory.setUsername("san-giorno");
        connectionFactory.setPassword("san-giorno");
        return connectionFactory;
    }

    /**
     * Template para envio de mensagens.
     */
    @Bean
    public RabbitTemplate rabbitTemplate(ConnectionFactory connectionFactory) {
        return new RabbitTemplate(connectionFactory);
    }

    /**
     * Define a fila para pagamentos parciais.
     */
    @Bean
    public Queue queueParcial() {
        return new Queue(FILA_PARCIAL, true);
    }

    /**
     * Define a fila para pagamentos totais.
     */
    @Bean
    public Queue queueTotal() {
        return new Queue(FILA_TOTAL, true);
    }

    /**
     * Define a fila para pagamentos excedentes.
     */
    @Bean
    public Queue queueExcedente() {
        return new Queue(FILA_EXCEDENTE, true);
    }
}
