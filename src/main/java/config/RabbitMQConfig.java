package config;

import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RabbitMQConfig {

    @Bean
    public Queue parcialQueue() {
        return new Queue("pagamento_parcial");
    }

    @Bean
    public Queue totalQueue() {
        return new Queue("pagamento_total");
    }

    @Bean
    public Queue excedenteQueue() {
        return new Queue("pagamento_excedente");
    }
}
