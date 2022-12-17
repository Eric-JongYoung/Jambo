package jambo.domain.user;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QIconShop is a Querydsl query type for IconShop
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QIconShop extends EntityPathBase<IconShop> {

    private static final long serialVersionUID = 1085845107L;

    public static final QIconShop iconShop = new QIconShop("iconShop");

    public final StringPath fileName = createString("fileName");

    public final ListPath<Icon, QIcon> icons = this.<Icon, QIcon>createList("icons", Icon.class, QIcon.class, PathInits.DIRECT2);

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath name = createString("name");

    public final NumberPath<Integer> price = createNumber("price", Integer.class);

    public final NumberPath<Integer> quantity = createNumber("quantity", Integer.class);

    public final DateTimePath<java.time.LocalDateTime> saveDate = createDateTime("saveDate", java.time.LocalDateTime.class);

    public QIconShop(String variable) {
        super(IconShop.class, forVariable(variable));
    }

    public QIconShop(Path<? extends IconShop> path) {
        super(path.getType(), path.getMetadata());
    }

    public QIconShop(PathMetadata metadata) {
        super(IconShop.class, metadata);
    }

}

