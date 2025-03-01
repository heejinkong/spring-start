package com.example.redis;

import java.util.Optional;
import javax.swing.text.html.Option;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class RedisRepositoryTests {
  @Autowired
  private ItemRepository itemRepository;

  @Test
  public void createTest() {
    //객체를 만들고
    Item item = Item.builder()
        .name("keyboard")
        .description("Very Expensive Keyboard")
        .price(100000)
        .build();
    //save 호출
    itemRepository.save(item);
  }

  @Test
  public void readOneTest() {
    Item item = itemRepository.findById("52c74067-d057-42a1-a7d4-c0505ac32341")
        .orElseThrow();
    System.out.println(item.getDescription());
  }

  @Test
  public void updateTest() {
    Item item = itemRepository.findById("52c74067-d057-42a1-a7d4-c0505ac32341")
        .orElseThrow();
    item.setDescription("On Sale!!!");
    itemRepository.save(item);
    System.out.println(item.getDescription());
  }

  @Test
  public void deleteTest() {
    itemRepository.deleteById("52c74067-d057-42a1-a7d4-c0505ac32341");

  }
}
