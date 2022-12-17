package jambo.domain.board;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QStudyBoardTechStack is a Querydsl query type for StudyBoardTechStack
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QStudyBoardTechStack extends EntityPathBase<StudyBoardTechStack> {

    private static final long serialVersionUID = 1691710286L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QStudyBoardTechStack studyBoardTechStack = new QStudyBoardTechStack("studyBoardTechStack");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final QStudyBoard studyBoard;

    public final jambo.domain.QTechStack techStack;

    public QStudyBoardTechStack(String variable) {
        this(StudyBoardTechStack.class, forVariable(variable), INITS);
    }

    public QStudyBoardTechStack(Path<? extends StudyBoardTechStack> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QStudyBoardTechStack(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QStudyBoardTechStack(PathMetadata metadata, PathInits inits) {
        this(StudyBoardTechStack.class, metadata, inits);
    }

    public QStudyBoardTechStack(Class<? extends StudyBoardTechStack> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.studyBoard = inits.isInitialized("studyBoard") ? new QStudyBoard(forProperty("studyBoard"), inits.get("studyBoard")) : null;
        this.techStack = inits.isInitialized("techStack") ? new jambo.domain.QTechStack(forProperty("techStack")) : null;
    }

}

