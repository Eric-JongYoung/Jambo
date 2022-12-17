package jambo.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QTechStack is a Querydsl query type for TechStack
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QTechStack extends EntityPathBase<TechStack> {

    private static final long serialVersionUID = 22466163L;

    public static final QTechStack techStack = new QTechStack("techStack");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final ListPath<jambo.domain.board.StudyBoardTechStack, jambo.domain.board.QStudyBoardTechStack> studyBoardTechStacks = this.<jambo.domain.board.StudyBoardTechStack, jambo.domain.board.QStudyBoardTechStack>createList("studyBoardTechStacks", jambo.domain.board.StudyBoardTechStack.class, jambo.domain.board.QStudyBoardTechStack.class, PathInits.DIRECT2);

    public final StringPath techStackName = createString("techStackName");

    public final ListPath<jambo.domain.user.UserTechStack, jambo.domain.user.QUserTechStack> userTechStacks = this.<jambo.domain.user.UserTechStack, jambo.domain.user.QUserTechStack>createList("userTechStacks", jambo.domain.user.UserTechStack.class, jambo.domain.user.QUserTechStack.class, PathInits.DIRECT2);

    public QTechStack(String variable) {
        super(TechStack.class, forVariable(variable));
    }

    public QTechStack(Path<? extends TechStack> path) {
        super(path.getType(), path.getMetadata());
    }

    public QTechStack(PathMetadata metadata) {
        super(TechStack.class, metadata);
    }

}

