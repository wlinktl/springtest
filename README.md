"# springtest" 

config:

spring.profiles.dev.redis.database=0
spring.profiles.qa.redis.database=1


application:
@Configuration
@Profile("dev")
@EnableRedisRepositories
public class DevRedisConfig {

    public RedisConnectionFactory redisConnectionFactory() {
        LettuceConnectionFactory factory = new LettuceConnectionFactory();
        factory.setDatabase(1); // Use database 1 for DEV
        return factory;
    }



@Service
public class RedisService {

    @Autowired
    private RedisTemplate<String, Object> redisTemplate;

    public void save(String key, String value) {
        redisTemplate.opsForValue().set(key, value);
    }

    public String get(String key) {
        return (String) redisTemplate.opsForValue().get(key);
    }
}
