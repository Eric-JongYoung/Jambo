package jambo.domain.board;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QBoard is a Querydsl query type for Board
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QBoard extends EntityPathBase<Board> {

    private static final long serialVersionUID = -1498985857L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QBoard board = new QBoard("board");

    public final EnumPath<jambo.domain.board.type.Category> category = createEnum("category", jambo.domain.board.type.Category.class);

    public final ListPath<jambo.domain.Comment, jambo.domain.QComment> commentList = this.<jambo.domain.Comment, jambo.domain.QComment>createList("commentList", jambo.domain.Comment.class, jambo.domain.QComment.class, PathInits.DIRECT2);

    public final StringPath content = createString("content");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final BooleanPath isReported = createBoolean("isReported");

    public final ListPath<Recommendation, QRecommendation> recommendation = this.<Recommendation, QRecommendation>createList("recommendation", Recommendation.class, QRecommendation.class, PathInits.DIRECT2);

    public final ListPath<Report, QReport> reports = this.<Report, QReport>createList("reports", Report.class, QReport.class, PathInits.DIRECT2);

    public final StringPath title = createString("title");

    public final jambo.domain.user.QUser user;

    public final NumberPath<Integer> views = createNumber("views", Integer.class);

    public final DateTimePath<java.time.LocalDateTime> writeDate = createDateTime("writeDate", java.time.LocalDateTime.class);

    public QBoard(String variable) {
        this(Board.class, forVariable(variable), INITS);
    }

    public QBoard(Path<? extends Board> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QBoard(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QBoard(PathMetadata metadata, PathInits inits) {
        this(Board.class, metadata, inits);
    }

    public QBoard(Class<? extends Board> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.user = inits.isInitialized("user") ? new jambo.domain.user.QUser(forProperty("user"), inits.get("user")) : null;
    }

}

