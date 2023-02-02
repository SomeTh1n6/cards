package ru.itmo.memory_cards.data

object Data {
    fun getQuestion(): ArrayList<Question>{
        val questionsList = ArrayList<Question>()

        val que1 = Question(
            "Вопрос 1",
            "Архитектура компьютерных систем. Архитектура Фон-Неймана и Гарвардская архитектура. Принципы архитектуры Фон-Неймана. Архитектуры NUMA и UMA"
        )
        questionsList.add(que1)

        val que2 = Question(
            "Вопрос 2",
            "Общая организация процессора, памяти, организация вычислений."
        )
        questionsList.add(que2)

        val que3 = Question(
            "Вопрос 3",
            "Организация прерываний, типы прерываний, контроллер прерываний."
        )
        questionsList.add(que3)

        val que4 = Question(
            "Вопрос 4",
            "Типичные функции операционной системы. Интерфейсы ОС. Работа ОС как замена оператора ЭВМ"
        )
        questionsList.add(que4)

        val que5 = Question(
            "Вопрос 5",
            "Пакетная обработка. Системный монитор"
        )
        questionsList.add(que5)

        val que6 = Question(
            "Вопрос 6",
            "Анализ общесистемной эффективности, как предусловие многозадачности. Многозадачность, как способ повышения системной эффективности. Системы разделения времени"
        )
        questionsList.add(que6)

        val que7 = Question(
            "Вопрос 7",
            "Процессы, проблемы современных процессов. Планирование выполнения процессов и управление ресурсами."
        )
        questionsList.add(que7)

        val que8 = Question(
            "Вопрос 8",
            "Управление памятью, виртуальная память. Защита информации и безопасность ОС."
        )
        questionsList.add(que8)

        val que9 = Question(
            "Вопрос 9",
            "Структура ядра операционной системы. Архитектуры монолитного ядра, ядра динамически загружаемыми модулями и микроядра."
        )
        questionsList.add(que9)

        val que10 = Question(
            "Вопрос 10",
            "Потоки исполнения, многопоточность, модели многопоточности."
        )
        questionsList.add(que10)

        val que11 = Question(
            "Вопрос 11",
            "Симметричная и ассиметричная многопроцессорная обработка"
        )
        questionsList.add(que11)

        val que12 = Question(
            "Вопрос 12",
            "Виртуализация. Типы виртуализации"
        )
        questionsList.add(que12)

        val que13 = Question(
            "Вопрос 13",
            ". Сбои и отказоустойчивость ОС. Причины появления отказов в ОС и способы борьбы с ними"
        )
        questionsList.add(que13)

        val que14 = Question(
            "Вопрос 14",
            "Надежность. Среднее время восстановления. Коэффициент доступности и время простоя."
        )
        questionsList.add(que14)

        val que15 = Question(
            "Вопрос 15",
            "Резервирование и отказоустойчивость."
        )
        questionsList.add(que15)

        val que16 = Question(
            "Вопрос 16",
            "История и развитие ОС GNU/Linux. Single UNIX Specification и POSIX"
        )
        questionsList.add(que16)

        val que17 = Question(
            "Вопрос 17",
            "Понятие дистрибутива, дистрибутивы Linux"
        )
        questionsList.add(que17)

        val que18 = Question(
            "Вопрос 18",
            "Архитектура и основные подсистемы Linux. Linux Kernel Map."
        )
        questionsList.add(que18)

        val que19 = Question(
            "Вопрос 19",
            "История и развитие Windows"
        )
        questionsList.add(que19)

        val que20 = Question(
            "Вопрос 20",
            "Общая архитектура Windows. Windows API."
        )
        questionsList.add(que20)

        val que21 = Question(
            "Вопрос 21",
            "Сервисы, функции и важные компоненты Windows."
        )
        questionsList.add(que21)

        val que22 = Question(
            "Вопрос 22",
            ". Процесс, характеристики процесса в момент выполнения. Состояние процесса. Разделение ресурсов."
        )
        questionsList.add(que22)

        val que23 = Question(
            "Вопрос 23",
            "Модель процесса с пятью состояниями, назначение состояний"
        )
        questionsList.add(que23)

        val que24 = Question(
            "Вопрос 24",
            "Paging и Swapping. Модель процесса с семью состяниями."
        )
        questionsList.add(que24)

        val que25 = Question(
            "Вопрос 25",
            "Управляющие таблицы процесса. Образ процесса."
        )
        questionsList.add(que25)

        val que26 = Question(
            "Вопрос 26",
            "Управляющие таблицы процесса. Образ процесса."
        )
        questionsList.add(que26)

        val que27 = Question(
            "Вопрос 27",
            "Функции ОС, связанные с процессами. Создание процесса, переключение процессов."
        )
        questionsList.add(que27)

        val que28 = Question(
            "Вопрос 28",
            "Процессы в ОС UNIX SVR4. Диаграмма состояний, основные структуры"
        )
        questionsList.add(que28)

        val que29 = Question(
            "Вопрос 29",
            "Понятие потока выполнения, связь потока и процесса. Преимущества потоков."
        )
        questionsList.add(que29)

        val que30 = Question(
            "Вопрос 30",
            "Состояния потока, User Level Threads vs Kernel Level Threads"
        )
        questionsList.add(que30)

        val que31 = Question(
            "Вопрос 31",
            "Многопроцессорность и многопоточность. Закон Амдала"
        )
        questionsList.add(que31)

        val que32 = Question(
            "Вопрос 32",
            "Механизм параллельных вычислений, функции ОС"
        )
        questionsList.add(que32)

        val que33 = Question(
            "Вопрос 33",
            "Проблемы параллельного выполнения: взаимоисключения, взаимоблокировки, голодание. Требования к взаимным исключениям. Уровни взаимодействия процессов и потоков"
        )
        questionsList.add(que33)

        val que34 = Question(
            "Вопрос 34",
            "Примитивы синхронизации ОС. Предназначение примитивов синхронизации"
        )
        questionsList.add(que34)

        val que35 = Question(
            "Вопрос 35",
            "Примитивы синхронизации ОС. Семафоры и мьютексы. Бинарный семафор"
        )
        questionsList.add(que35)

        val que36 = Question(
            "Вопрос 36",
            "Примитивы синхронизации ОС. Условные переменные, rwlocks"
        )
        questionsList.add(que36)

        val que37 = Question(
            "Вопрос 37",
            "Примитивы синхронизации ОС. Мониторы, флаги событий, передача сообщений."
        )
        questionsList.add(que37)

        val que38 = Question(
            "Вопрос 38",
            "Примитивы синхронизации ОС. Неблокирующие примитивы синхронизации и неблокирующие структуры данных."
        )
        questionsList.add(que38)

        val que39 = Question(
            "Вопрос 39",
            "Управление памятью, основные определения и требования к организации."
        )
        questionsList.add(que39)

        val que40 = Question(
            "Вопрос 40",
            "Фиксированное и динамическое размещение программ в памяти."
        )
        questionsList.add(que40)

        val que41 = Question(
            "Вопрос 41",
            "Модели аппаратного перемещения программ"
        )
        questionsList.add(que41)

        val que42 = Question(
            "Вопрос 42",
            "Простой страничный поход и простая сегментная организация."
        )
        questionsList.add(que42)

        val que43 = Question(
            "Вопрос 43",
            "Виртуальная память основные определения и принципы организации аппаратуры и управляющих программ.."
        )
        questionsList.add(que43)

        val que44 = Question(
            "Вопрос 44",
            "Виртуальный страничный обмен. Двухуровневая организация MMU и TLB 80386. (для КОТ и ГТ — общие принципы)"
        )
        questionsList.add(que44)

        val que45 = Question(
            "Вопрос 45",
            "Инвертированная таблица страниц."
        )
        questionsList.add(que45)

        val que46 = Question(
            "Вопрос 46",
            "Сегментно-страничная виртуальная память."
        )
        questionsList.add(que46)

        val que47 = Question(
            "Вопрос 47",
            "Влияние размера страницы виртуальной памяти на ОС. Стратегии ОС по работе с виртуальной памятью."
        )
        questionsList.add(que47)

        val que48 = Question(
            "Вопрос 48",
            "Стратегии замещения страниц ОС. Часовой Алгоритм. Управление резидентной частью процесса."
        )
        questionsList.add(que48)

        val que49 = Question(
            "Вопрос 49",
            "Виды планирования процессов. Критерии краткосрочного планирования. Приоритеты."
        )
        questionsList.add(que49)

        val que50 = Question(
            "Вопрос 50",
            "Использование приоритетов.\n"
        )
        questionsList.add(que50)

        val que51 = Question(
            "Вопрос 51",
            "Feedback планировщик и классы планирования ОС UNIX SVR4."
        )
        questionsList.add(que51)

        val que52 = Question(
            "Вопрос 52",
            "Стратегии планирования FCFS, RR, SPN, SRT, HRRN, Feedback."
        )
        questionsList.add(que52)

        val que53 = Question(
            "Вопрос 53",
            "Справедливое планирование."
        )
        questionsList.add(que53)

        val que54 = Question(
            "Вопрос 54",
            "Планирование в многопроцессорных системах. Типы многопроцессорных систем с точки зрения организации планирования. Гранулярность и проектирование планировщиков процессов и потоков для многопроцессорных систем"
        )
        questionsList.add(que54)

        val que55 = Question(
            "Вопрос 55",
            "ОС реального времени и планировщики. Deadline-планирование."
        )
        questionsList.add(que55)

        val que56 = Question(
            "Вопрос 56",
            "Проблема инверсии приоритетов, типы инверсии и способы решения в планировщике"
        )
        questionsList.add(que56)

        val que57 = Question(
            "Вопрос 57",
            "Ввод-вывод. Современные устройства и скорости обмена, развитие способов вводавывода, логическая структура ввода-вывода."
        )
        questionsList.add(que57)

        val que58 = Question(
            "Вопрос 58",
            "Буферизация ввода вывода. Ввод-вывод в UNIX SVR4."
        )
        questionsList.add(que58)

        val que59 = Question(
            "Вопрос 59",
            "Диски и дисковое планирование."
        )
        questionsList.add(que59)

        val que60 = Question(
            "Вопрос 60",
            "Концепции RAID"
        )
        questionsList.add(que60)

        val que61 = Question(
            "Вопрос 61",
            "RAID-0, 1, 10, 0+1."
        )
        questionsList.add(que61)

        val que62 = Question(
            "Вопрос 62",
            "RAID 4,5,6. Аппаратные дисковые массивы"
        )
        questionsList.add(que62)

        val que63 = Question(
            "Вопрос 63",
            "Файловый ввод-вывод, основные определения. Задачи ОС по управлению файлами. Совместное использование файлов."
        )
        questionsList.add(que63)

        val que64 = Question(
            "Вопрос 64",
            "Управление файлами в UNIX SVR4"
        )
        questionsList.add(que64)

        val que65 = Question(
            "Вопрос 65",
            "Каталоги файлов. Элементы каталога, операции ОС"
        )
        questionsList.add(que65)

        val que66 = Question(
            "Вопрос 66",
            "Размещение записей и файлов в блоках данных. Сложность и типы организации размещения. "
        )
        questionsList.add(que66)

        val que67 = Question(
            "Вопрос 67",
            "Непрерывное размещение файлов (на примере ОС RT-11)"
        )
        questionsList.add(que67)

        val que68 = Question(
            "Вопрос 68",
            "Цепочечное размещение файлов (на примере DOS FAT)\n"
        )
        questionsList.add(que68)

        val que69 = Question(
            "Вопрос 69",
            "Индексированное размещение (на примере файловой системы UNIX UFS)"
        )
        questionsList.add(que69)

        val que70 = Question(
            "Вопрос 70",
            "Linux: стандартные средства для наблюдения счетчиков ядра."
        )
        questionsList.add(que70)

        val que71 = Question(
            "Вопрос 71",
            "Linux: файловая система /proc."
        )
        questionsList.add(que71)

        val que72 = Question(
            "Вопрос 72",
            "Linux: трассировщики системных вызовов и библиотек."
        )
        questionsList.add(que72)

        val que73 = Question(
            "Вопрос 73",
            "Linux: Профилировщик perf и FlameGraph."
        )
        questionsList.add(que73)

        val que74 = Question(
            "Вопрос 74",
            "Linux: SystemTap."
        )
        questionsList.add(que74)

        val que75 = Question(
            "Вопрос 75",
            "Linux: Отладчик ядра."
        )
        questionsList.add(que75)

        val que76 = Question(
            "Вопрос 76",
            "Windows: стандартные отладочные средства."
        )
        questionsList.add(que76)

        val que77 = Question(
            "Вопрос 77",
            "Windows: утилиты SysInternals"
        )
        questionsList.add(que77)

        val que78 = Question(
            "Вопрос 78",
            "Windows: отладчики WinDbg и KD"
        )
        questionsList.add(que78)

        val que79 = Question(
            "Вопрос 79",
            "Аппаратная поддержка взаимных исключений"
        )
        questionsList.add(que79)

        val que80 = Question(
            "Вопрос 80",
            "Эволюция похода к блокировке (Столлингс, гл. 5.1)"
        )
        questionsList.add(que80)

        val que81 = Question(
            "Вопрос 81",
            "Принципы взаимного блокирования (Столлингс, гл. 6.1)"
        )
        questionsList.add(que81)

        val que82 = Question(
            "Вопрос 82",
            "Предотвращения взаимоблокировок, устранение взаимоблокировок, обнаружение блокировок. (Столлингс, гл. 6.2, 6.3, 6.4)\n"
        )
        questionsList.add(que82)

        val que83 = Question(
            "Вопрос 83",
            "Задача об обедающих философах (Столлингс, гл. 6.6)"
        )
        questionsList.add(que83)

        val que84 = Question(
            "Вопрос 84",
            "Процессы в Linux: структура task_struct, поля струткуры, связь с другими структурами ядра"
        )
        questionsList.add(que84)

        val que85 = Question(
            "Вопрос 85",
            "Диаграмма состояния процесса Linux"
        )
        questionsList.add(que85)

        val que86 = Question(
            "Вопрос 86",
            "Создание процесса Linux на уровне пользовательского процесса."
        )
        questionsList.add(que86)

        val que87 = Question(
            "Вопрос 87",
            "Создание и завершение процесса Linux на уровне ядра. Вызываемые функции"
        )
        questionsList.add(que87)

        val que88 = Question(
            "Вопрос 88",
            "Особенности реализации потоков в Linux. KThread. Tasklet."
        )
        questionsList.add(que88)

        val que89 = Question(
            "Вопрос 89",
            "Примитивы синхронизации Linux. Spinlock и qspinlock"
        )
        questionsList.add(que89)

        val que90 = Question(
            "Вопрос 90",
            "Примитивы синхронизации Linux. Semaphore и Mutex"
        )
        questionsList.add(que90)

        val que91 = Question(
            "Вопрос 91",
            "Примитивы синхронизации Linux. rw_semaphore, seqlock."
        )
        questionsList.add(que91)

        val que92 = Question(
            "Вопрос 92",
            "Типы процессов и потоков Windows."
        )
        questionsList.add(que92)

        val que93 = Question(
            "Вопрос 93",
            ". Структура процесса и потока в Windows. Поля структур"
        )
        questionsList.add(que93)

        val que94 = Question(
            "Вопрос 94",
            "Диаграммы состояний процесса и потока Windows"
        )
        questionsList.add(que94)

        val que95 = Question(
            "Вопрос 95",
            "Создание и завершение процесса Windows."
        )
        questionsList.add(que95)

        val que96 = Question(
            "Вопрос 96",
            "Примитивы синхронизации Windows. Понятие Dispatcher Object. Ожидание наступление события, вызовы Wait"
        )
        questionsList.add(que96)

        val que97 = Question(
            "Вопрос 97",
            "Примитивы синхронизации Windows. EventObject, Mutex, Mutant."
        )
        questionsList.add(que97)

        val que98 = Question(
            "Вопрос 98",
            "Примитивы синхронизации Windows. Fast mutex, Guarded mutex."
        )
        questionsList.add(que98)

        val que99 = Question(
            "Вопрос 99",
            "Примитивы синхронизации Windows. Semaphore, spinlock"
        )
        questionsList.add(que99)

        val que100 = Question(
            "Вопрос 100",
            "Хешированная таблица страниц SPARC64."
        )
        questionsList.add(que100)

        val que101 = Question(
            "Вопрос 101",
            "Виртуальная память Linux. 32-х разрядная модель."
        )
        questionsList.add(que101)

        val que102 = Question(
            "Вопрос 102",
            "Виртуальная память Linux. 64-х разрядные модели."
        )
        questionsList.add(que102)

        val que103 = Question(
            "Вопрос 103",
            "Виртуальная память Linux. 64-х разрядные модели."
        )
        questionsList.add(que103)

        val que104 = Question(
            "Вопрос 104",
            "Способы выделения памяти для пользовательских процессов Linux"
        )
        questionsList.add(que104)

        val que105 = Question(
            "Вопрос 105",
            "Способы выделения памяти в пространстве ядра Linux."
        )
        questionsList.add(que105)

        val que106 = Question(
            "Вопрос 106",
            "Слаб-аллокаторы SLAB/SLUB/SLOB."
        )
        questionsList.add(que106)

        val que107 = Question(
            "Вопрос 107",
            "Copy on write и pagefault в Linux"
        )
        questionsList.add(que107)

        val que108 = Question(
            "Вопрос 108",
            "Замещение страниц в Linux. Kswapd"
        )
        questionsList.add(que108)

        return questionsList
    }

}