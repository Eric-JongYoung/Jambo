package jambo.domain.user;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QUserTechStack is a Querydsl query type for UserTechStack
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QUserTechStack extends EntityPathBase<UserTechStack> {

    private static final long serialVersionUID = -1540489949L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QUserTechStack userTechStack = new QUserTechStack("userTechStack");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final jambo.domain.QTechStack techStack;

    public final QUser user;

    public QUserTechStack(String variable) {
        this(UserTechStack.class, forVariable(variable), INITS);
    }

    public QUserTechStack(Path<? extends UserTechStack> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QUserTechStack(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QUserTechStack(PathMetadata metadata, PathInits inits) {
        this(UserTechStack.class, metadata, inits);
    }

    public QUserTechStack(Class<? extends UserTechStack> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.techStack = inits.isInitialized("techStack") ? new jambo.domain.QTechStack(forProperty("techStack")) : null;
        this.user = inits.isInitialized("user") ? new QUser(forProperty("user"), inits.get("user")) : null;
    }

}

