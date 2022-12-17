package jambo.domain.user;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QUser is a Querydsl query type for User
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QUser extends EntityPathBase<User> {

    private static final long serialVersionUID = 1161774383L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QUser user = new QUser("user");

    public final ListPath<Alarm, QAlarm> alarms = this.<Alarm, QAlarm>createList("alarms", Alarm.class, QAlarm.class, PathInits.DIRECT2);

    public final StringPath email = createString("email");

    public final ListPath<Icon, QIcon> icons = this.<Icon, QIcon>createList("icons", Icon.class, QIcon.class, PathInits.DIRECT2);

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final DateTimePath<java.time.LocalDateTime> joinDate = createDateTime("joinDate", java.time.LocalDateTime.class);

    public final StringPath mainEmotion = createString("mainEmotion");

    public final EnumPath<jambo.domain.user.type.MBTI> mbti = createEnum("mbti", jambo.domain.user.type.MBTI.class);

    public final StringPath name = createString("name");

    public final StringPath nickName = createString("nickName");

    public final ListPath<Note, QNote> notes = this.<Note, QNote>createList("notes", Note.class, QNote.class, PathInits.DIRECT2);

    public final StringPath password = createString("password");

    public final StringPath phone = createString("phone");

    public final QPoint point;

    public final ListPath<jambo.domain.board.Recommendation, jambo.domain.board.QRecommendation> recommendation = this.<jambo.domain.board.Recommendation, jambo.domain.board.QRecommendation>createList("recommendation", jambo.domain.board.Recommendation.class, jambo.domain.board.QRecommendation.class, PathInits.DIRECT2);

    public final ListPath<jambo.domain.board.Report, jambo.domain.board.QReport> reports = this.<jambo.domain.board.Report, jambo.domain.board.QReport>createList("reports", jambo.domain.board.Report.class, jambo.domain.board.QReport.class, PathInits.DIRECT2);

    public final ListPath<UserTechStack, QUserTechStack> userTechStacks = this.<UserTechStack, QUserTechStack>createList("userTechStacks", UserTechStack.class, QUserTechStack.class, PathInits.DIRECT2);

    public QUser(String variable) {
        this(User.class, forVariable(variable), INITS);
    }

    public QUser(Path<? extends User> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QUser(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QUser(PathMetadata metadata, PathInits inits) {
        this(User.class, metadata, inits);
    }

    public QUser(Class<? extends User> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.point = inits.isInitialized("point") ? new QPoint(forProperty("point"), inits.get("point")) : null;
    }

}

