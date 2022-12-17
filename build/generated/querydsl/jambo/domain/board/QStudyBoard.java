package jambo.domain.board;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QStudyBoard is a Querydsl query type for StudyBoard
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QStudyBoard extends EntityPathBase<StudyBoard> {

    private static final long serialVersionUID = 133243556L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QStudyBoard studyBoard = new QStudyBoard("studyBoard");

    public final QBoard _super;

    //inherited
    public final EnumPath<jambo.domain.board.type.Category> category;

    //inherited
    public final ListPath<jambo.domain.Comment, jambo.domain.QComment> commentList;

    //inherited
    public final StringPath content;

    //inherited
    public final NumberPath<Long> id;

    public final BooleanPath isOnline = createBoolean("isOnline");

    public final BooleanPath isRecruiting = createBoolean("isRecruiting");

    //inherited
    public final BooleanPath isReported;

    public final NumberPath<Integer> numberOfRecruits = createNumber("numberOfRecruits", Integer.class);

    public final StringPath period = createString("period");

    //inherited
    public final ListPath<Recommendation, QRecommendation> recommendation;

    //inherited
    public final ListPath<Report, QReport> reports;

    public final StringPath startDate = createString("startDate");

    public final ListPath<StudyBoardTechStack, QStudyBoardTechStack> studyBoardTechStacks = this.<StudyBoardTechStack, QStudyBoardTechStack>createList("studyBoardTechStacks", StudyBoardTechStack.class, QStudyBoardTechStack.class, PathInits.DIRECT2);

    public final EnumPath<jambo.domain.board.type.SupportMethod> supportMethod = createEnum("supportMethod", jambo.domain.board.type.SupportMethod.class);

    //inherited
    public final StringPath title;

    // inherited
    public final jambo.domain.user.QUser user;

    //inherited
    public final NumberPath<Integer> views;

    //inherited
    public final DateTimePath<java.time.LocalDateTime> writeDate;

    public QStudyBoard(String variable) {
        this(StudyBoard.class, forVariable(variable), INITS);
    }

    public QStudyBoard(Path<? extends StudyBoard> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QStudyBoard(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QStudyBoard(PathMetadata metadata, PathInits inits) {
        this(StudyBoard.class, metadata, inits);
    }

    public QStudyBoard(Class<? extends StudyBoard> type, PathMetadata metadata, PathInits inits) {
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

