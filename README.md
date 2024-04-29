# Supporty Frontend

### Convention
#### Branch Strategy
```
main: 제품 출시 가능한 브랜치
develop: 다음 출시 버전 개발하는 브랜치

feature: 기능 개발하는 브랜치
    └─ DOMAIN/이슈번호/이름    ex) Diary/#3/길동
release: 이번 출시 버전 준비하는 브랜치
hotfix: 출시 버전에서 발생한 버그를 수정하는 브랜치
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
