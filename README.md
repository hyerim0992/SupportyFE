# Supporty Frontend

### Convention
#### Branch Strategy
```
- 메인 브랜치 (항상 유지)
main: 제품 출시 가능한 브랜치
develop: 다음 출시 버전 개발하는 브랜치

- 보조 브랜치 (일정 기간 동안 유지)
feature: 기능 개발하는 브랜치
    └─ feature/DOMAIN/이슈번호    ex) feature/Diary/#3
release: 이번 출시 버전 준비하는 브랜치
hotfix: 출시 버전에서 발생한 버그를 수정하는 브랜치
```

##### 브랜치 작업 순서
```
1. 개발자는 develop 브랜치로부터 본인이 개발한 기능을 위해 feature 브랜치를 만듭니다. 

2. feature 브랜치에서 기능을 만들고, 기능완성이 되면 develop 브랜치에 merge 합니다. 

3. 이번 배포 버전이 develop 브랜치에 모두 merge가 되었다면, QA를 위해 release 브랜치를 생성합니다.

4. release 브랜치에서 오류가 발생한다면 release 브랜치 내에서 수정합니다. 

   4-1. QA가 끝났다면 해당 버전을 배포하기 위해 main 버전으로 merge 합니다. 

   4-2. bugfix 가 있었다면, 수정한 부분을 develop 브랜치에도 반영하기 위해 develop 브랜치에도 merge합니다. 

5. main 브랜치에서 버그가 발생한다면, hotfix 브랜치를 생성합니다. 

6. hotfix 브랜치에서 bugfix가 끝나면, main 브랜치와 develop 브랜치에 각각 merge합니다. 
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
