package jambo.domain.board;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QRecommendation is a Querydsl query type for Recommendation
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QRecommendation extends EntityPathBase<Recommendation> {

    private static final long serialVersionUID = -1937973184L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QRecommendation recommendation = new QRecommendation("recommendation");

    public final QBoard board;

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final jambo.domain.user.QUser user;

    public QRecommendation(String variable) {
        this(Recommendation.class, forVariable(variable), INITS);
    }

    public QRecommendation(Path<? extends Recommendation> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QRecommendation(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QRecommendation(PathMetadata metadata, PathInits inits) {
        this(Recommendation.class, metadata, inits);
    }

    public QRecommendation(Class<? extends Recommendation> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.board = inits.isInitialized("board") ? new QBoard(forProperty("board"), inits.get("board")) : null;
        this.user = inits.isInitialized("user") ? new jambo.domain.user.QUser(forProperty("user"), inits.get("user")) : null;
    }

}

