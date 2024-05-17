import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public abstract class Repository<EntityImplementation extends Entity> {
    public EntityImplementation create(EntityImplementation entity){
        return entity;
    }
    public EntityImplementation update(EntityImplementation entity){
        return entity;

    }
    public EntityImplementation delete(EntityImplementation entity){
        return entity;

    }
    public List<EntityImplementation> listAll(){
        return new ArrayList<>();

    }
    public EntityImplementation findById(){
        return null;
    }

    public boolean getOrCreate(EntityImplementation entity, String... defaults) {
        return true;
    }
}
