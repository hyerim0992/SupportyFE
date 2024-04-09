# Supporty Frontend

### Convention
#### Branch Strategy
```
main
└─ develop
<<<<<<< HEAD
    └─ DOMAIN/이슈번호    ex) Diary/#3
=======
    └─ DOMAIN/이슈번호/이름    ex) Diary/#3/길동
>>>>>>> e1f93b2f6e21bc58ec4f57cf36ac819570dca219
```

#### Commit Message
```javascript
<type>: <description>

[optional body]
ex) feat: 회원가입/로그인
    fix: 회원가입 이메일 인증 오류
```

#### Commit Type
| type      | 설명                                               |
|-----------|--------------------------------------------------|
| `feat`    | A new feature                                    |
| `test`    | Adding new test or making changes to existing test |
| `fix`     | A bug fix                                        |
| `perf`    | A code that improves performance                 |
| `docs`    | Documentation a related changes                  |
| `refactor` | Changes for refactoring                      |
| `build`   | Changes related to building the code             |
| `chore`   | Changes that do not affect the external user     |
