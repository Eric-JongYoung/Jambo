package jambo.domain.board;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QNormalBoard is a Querydsl query type for NormalBoard
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QNormalBoard extends EntityPathBase<NormalBoard> {

    private static final long serialVersionUID = -2113159400L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QNormalBoard normalBoard = new QNormalBoard("normalBoard");

    public final QBoard _super;

    //inherited
    public final EnumPath<jambo.domain.board.type.Category> category;

    //inherited
    public final ListPath<jambo.domain.Comment, jambo.domain.QComment> commentList;

    //inherited
    public final StringPath content;

    //inherited
    public final NumberPath<Long> id;

    //inherited
    public final BooleanPath isReported;

    //inherited
    public final ListPath<Recommendation, QRecommendation> recommendation;

    //inherited
    public final ListPath<Report, QReport> reports;

    //inherited
    public final StringPath title;

    // inherited
    public final jambo.domain.user.QUser user;

    //inherited
    public final NumberPath<Integer> views;

    //inherited
    public final DateTimePath<java.time.LocalDateTime> writeDate;

    public QNormalBoard(String variable) {
        this(NormalBoard.class, forVariable(variable), INITS);
    }

    public QNormalBoard(Path<? extends NormalBoard> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QNormalBoard(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QNormalBoard(PathMetadata metadata, PathInits inits) {
        this(NormalBoard.class, metadata, inits);
    }

    public QNormalBoard(Class<? extends NormalBoard> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this._super = new QBoard(type, metadata, inits);
        this.category = _super.category;
        this.commentList = _super.commentList;
        this.content = _super.content;
        this.id = _super.id;
        this.isReported = _super.isReported;
        this.recommendation = _super.recommendation;
        this.reports = _super.reports;
        this.title = _super.title;
        this.user = _super.user;
        this.views = _super.views;
        this.writeDate = _super.writeDate;
    }

}

