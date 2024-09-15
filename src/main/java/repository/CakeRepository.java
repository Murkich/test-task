package repository;

import common.CakeType;
import entity.CakeEntity;

import java.time.OffsetDateTime;
import java.util.List;
import java.util.UUID;

public class CakeRepository {

    public static final List<CakeEntity> db = List.of(
            new CakeEntity(UUID.randomUUID(), "cake1", CakeType.BIG, OffsetDateTime.now()),
            new CakeEntity(UUID.randomUUID(), "cake2", CakeType.SMALL, OffsetDateTime.now()),
            new CakeEntity(UUID.randomUUID(), "cake3", CakeType.BIG, OffsetDateTime.now())
    );

    public List<CakeEntity> getCakes() {
        return db;
    }

    public CakeEntity getCakeById(UUID cakeId) {
        return db.get(0);
    }

    public CakeEntity create(CakeEntity cakeEntity) {
        return cakeEntity;
    }

    public CakeEntity update(UUID cakeId, CakeEntity newCakeEntity) {
        return newCakeEntity.setId(cakeId);
    }

    public void delete(UUID cakeId) {
        //without code
    }
}
